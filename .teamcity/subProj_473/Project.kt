package subProj_473

import subProj_473.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_473")
    name = "subProj 473"

    buildType(subProj_bt_473_5)
    buildType(subProj_bt_473_4)
    buildType(subProj_bt_473_3)
    buildType(subProj_bt_473_2)
    buildType(subProj_bt_473_1)
    buildType(subProj_bt_473_0)
})
