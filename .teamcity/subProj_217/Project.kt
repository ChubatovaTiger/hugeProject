package subProj_217

import subProj_217.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_217")
    name = "subProj 217"

    buildType(subProj_bt_217_0)
    buildType(subProj_bt_217_1)
    buildType(subProj_bt_217_2)
    buildType(subProj_bt_217_3)
    buildType(subProj_bt_217_4)
    buildType(subProj_bt_217_5)
})
