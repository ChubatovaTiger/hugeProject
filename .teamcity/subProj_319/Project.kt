package subProj_319

import subProj_319.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_319")
    name = "subProj 319"

    buildType(subProj_bt_319_0)
    buildType(subProj_bt_319_3)
    buildType(subProj_bt_319_4)
    buildType(subProj_bt_319_1)
    buildType(subProj_bt_319_2)
    buildType(subProj_bt_319_5)
})
