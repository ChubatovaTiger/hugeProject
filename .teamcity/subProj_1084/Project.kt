package subProj_1084

import subProj_1084.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1084")
    name = "subProj 1084"

    buildType(subProj_bt_1084_5)
    buildType(subProj_bt_1084_3)
    buildType(subProj_bt_1084_4)
    buildType(subProj_bt_1084_1)
    buildType(subProj_bt_1084_2)
    buildType(subProj_bt_1084_0)
})
