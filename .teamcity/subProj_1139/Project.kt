package subProj_1139

import subProj_1139.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1139")
    name = "subProj 1139"

    buildType(subProj_bt_1139_2)
    buildType(subProj_bt_1139_3)
    buildType(subProj_bt_1139_0)
    buildType(subProj_bt_1139_1)
    buildType(subProj_bt_1139_4)
    buildType(subProj_bt_1139_5)
})
