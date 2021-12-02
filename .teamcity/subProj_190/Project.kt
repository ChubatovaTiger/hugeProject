package subProj_190

import subProj_190.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_190")
    name = "subProj 190"

    buildType(subProj_bt_190_4)
    buildType(subProj_bt_190_5)
    buildType(subProj_bt_190_2)
    buildType(subProj_bt_190_3)
    buildType(subProj_bt_190_0)
    buildType(subProj_bt_190_1)
})
