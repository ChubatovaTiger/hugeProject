package subProj_303

import subProj_303.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_303")
    name = "subProj 303"

    buildType(subProj_bt_303_0)
    buildType(subProj_bt_303_1)
    buildType(subProj_bt_303_4)
    buildType(subProj_bt_303_5)
    buildType(subProj_bt_303_2)
    buildType(subProj_bt_303_3)
})
