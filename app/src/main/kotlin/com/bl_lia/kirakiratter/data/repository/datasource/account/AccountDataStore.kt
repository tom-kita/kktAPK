package com.bl_lia.kirakiratter.data.repository.datasource.account

import com.bl_lia.kirakiratter.domain.entity.Account
import com.bl_lia.kirakiratter.domain.entity.Relationship
import com.bl_lia.kirakiratter.domain.entity.Status
import io.reactivex.Single

interface AccountDataStore {

    fun status(id: Int): Single<List<Status>>
    fun moreStatus(id: Int, maxId: Int?, sinceId: Int?): Single<List<Status>>
    fun relationship(id: Int): Single<Relationship>

    fun follow(id: Int): Single<Relationship>
    fun unfollow(id: Int): Single<Relationship>

    fun verifyCredentials(): Single<Account>
}