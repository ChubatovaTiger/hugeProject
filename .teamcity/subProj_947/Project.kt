package subProj_947

import subProj_947.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_947")
    name = "subProj 947"

    buildType(subProj_bt_947_0)
    buildType(subProj_bt_947_1)
    buildType(subProj_bt_947_2)
    buildType(subProj_bt_947_3)
    buildType(subProj_bt_947_4)
    buildType(subProj_bt_947_5)
})
