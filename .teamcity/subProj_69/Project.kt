package subProj_69

import subProj_69.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_69")
    name = "subProj 69"

    buildType(subProj_bt_69_1)
    buildType(subProj_bt_69_2)
    buildType(subProj_bt_69_0)
    buildType(subProj_bt_69_5)
    buildType(subProj_bt_69_3)
    buildType(subProj_bt_69_4)
})
