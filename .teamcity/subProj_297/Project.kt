package subProj_297

import subProj_297.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_297")
    name = "subProj 297"

    buildType(subProj_bt_297_0)
    buildType(subProj_bt_297_1)
    buildType(subProj_bt_297_2)
    buildType(subProj_bt_297_3)
    buildType(subProj_bt_297_4)
    buildType(subProj_bt_297_5)
})
