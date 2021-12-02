package subProj_602

import subProj_602.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_602")
    name = "subProj 602"

    buildType(subProj_bt_602_4)
    buildType(subProj_bt_602_5)
    buildType(subProj_bt_602_0)
    buildType(subProj_bt_602_1)
    buildType(subProj_bt_602_2)
    buildType(subProj_bt_602_3)
})
