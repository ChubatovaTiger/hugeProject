package subProj_376

import subProj_376.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_376")
    name = "subProj 376"

    buildType(subProj_bt_376_3)
    buildType(subProj_bt_376_2)
    buildType(subProj_bt_376_5)
    buildType(subProj_bt_376_4)
    buildType(subProj_bt_376_1)
    buildType(subProj_bt_376_0)
})
