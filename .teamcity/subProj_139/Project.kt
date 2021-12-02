package subProj_139

import subProj_139.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_139")
    name = "subProj 139"

    buildType(subProj_bt_139_4)
    buildType(subProj_bt_139_3)
    buildType(subProj_bt_139_2)
    buildType(subProj_bt_139_1)
    buildType(subProj_bt_139_0)
    buildType(subProj_bt_139_5)
})
