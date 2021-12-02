package subProj_1601

import subProj_1601.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1601")
    name = "subProj 1601"

    buildType(subProj_bt_1601_3)
    buildType(subProj_bt_1601_2)
    buildType(subProj_bt_1601_1)
    buildType(subProj_bt_1601_0)
    buildType(subProj_bt_1601_5)
    buildType(subProj_bt_1601_4)
})
