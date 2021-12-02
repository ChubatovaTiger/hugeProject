package subProj_466

import subProj_466.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_466")
    name = "subProj 466"

    buildType(subProj_bt_466_3)
    buildType(subProj_bt_466_2)
    buildType(subProj_bt_466_1)
    buildType(subProj_bt_466_0)
    buildType(subProj_bt_466_5)
    buildType(subProj_bt_466_4)
})
