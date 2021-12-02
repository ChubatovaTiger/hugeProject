package subProj_1254

import subProj_1254.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1254")
    name = "subProj 1254"

    buildType(subProj_bt_1254_3)
    buildType(subProj_bt_1254_2)
    buildType(subProj_bt_1254_5)
    buildType(subProj_bt_1254_4)
    buildType(subProj_bt_1254_1)
    buildType(subProj_bt_1254_0)
})
