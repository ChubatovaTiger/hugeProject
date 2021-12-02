package subProj_1206

import subProj_1206.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1206")
    name = "subProj 1206"

    buildType(subProj_bt_1206_5)
    buildType(subProj_bt_1206_4)
    buildType(subProj_bt_1206_3)
    buildType(subProj_bt_1206_2)
    buildType(subProj_bt_1206_1)
    buildType(subProj_bt_1206_0)
})
