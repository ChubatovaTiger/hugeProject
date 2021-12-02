package subProj_218

import subProj_218.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_218")
    name = "subProj 218"

    buildType(subProj_bt_218_0)
    buildType(subProj_bt_218_1)
    buildType(subProj_bt_218_2)
    buildType(subProj_bt_218_3)
    buildType(subProj_bt_218_4)
    buildType(subProj_bt_218_5)
})
