package subProj_492

import subProj_492.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_492")
    name = "subProj 492"

    buildType(subProj_bt_492_3)
    buildType(subProj_bt_492_4)
    buildType(subProj_bt_492_5)
    buildType(subProj_bt_492_0)
    buildType(subProj_bt_492_1)
    buildType(subProj_bt_492_2)
})
