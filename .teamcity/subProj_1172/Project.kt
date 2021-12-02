package subProj_1172

import subProj_1172.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1172")
    name = "subProj 1172"

    buildType(subProj_bt_1172_3)
    buildType(subProj_bt_1172_4)
    buildType(subProj_bt_1172_5)
    buildType(subProj_bt_1172_0)
    buildType(subProj_bt_1172_1)
    buildType(subProj_bt_1172_2)
})
