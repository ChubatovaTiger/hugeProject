package subProj_605

import subProj_605.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_605")
    name = "subProj 605"

    buildType(subProj_bt_605_5)
    buildType(subProj_bt_605_1)
    buildType(subProj_bt_605_2)
    buildType(subProj_bt_605_3)
    buildType(subProj_bt_605_4)
    buildType(subProj_bt_605_0)
})
