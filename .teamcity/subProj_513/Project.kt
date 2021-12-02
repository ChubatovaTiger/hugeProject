package subProj_513

import subProj_513.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_513")
    name = "subProj 513"

    buildType(subProj_bt_513_5)
    buildType(subProj_bt_513_3)
    buildType(subProj_bt_513_4)
    buildType(subProj_bt_513_1)
    buildType(subProj_bt_513_2)
    buildType(subProj_bt_513_0)
})
