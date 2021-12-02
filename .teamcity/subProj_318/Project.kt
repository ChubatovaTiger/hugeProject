package subProj_318

import subProj_318.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_318")
    name = "subProj 318"

    buildType(subProj_bt_318_0)
    buildType(subProj_bt_318_1)
    buildType(subProj_bt_318_4)
    buildType(subProj_bt_318_5)
    buildType(subProj_bt_318_2)
    buildType(subProj_bt_318_3)
})
