package subProj_1122

import subProj_1122.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1122")
    name = "subProj 1122"

    buildType(subProj_bt_1122_3)
    buildType(subProj_bt_1122_2)
    buildType(subProj_bt_1122_5)
    buildType(subProj_bt_1122_4)
    buildType(subProj_bt_1122_1)
    buildType(subProj_bt_1122_0)
})
