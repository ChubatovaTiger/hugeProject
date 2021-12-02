package subProj_930

import subProj_930.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_930")
    name = "subProj 930"

    buildType(subProj_bt_930_0)
    buildType(subProj_bt_930_1)
    buildType(subProj_bt_930_2)
    buildType(subProj_bt_930_3)
    buildType(subProj_bt_930_4)
    buildType(subProj_bt_930_5)
})
