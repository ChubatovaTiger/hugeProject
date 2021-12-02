package subProj_631

import subProj_631.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_631")
    name = "subProj 631"

    buildType(subProj_bt_631_5)
    buildType(subProj_bt_631_4)
    buildType(subProj_bt_631_1)
    buildType(subProj_bt_631_0)
    buildType(subProj_bt_631_3)
    buildType(subProj_bt_631_2)
})
