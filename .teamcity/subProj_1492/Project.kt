package subProj_1492

import subProj_1492.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1492")
    name = "subProj 1492"

    buildType(subProj_bt_1492_5)
    buildType(subProj_bt_1492_4)
    buildType(subProj_bt_1492_3)
    buildType(subProj_bt_1492_2)
    buildType(subProj_bt_1492_1)
    buildType(subProj_bt_1492_0)
})
