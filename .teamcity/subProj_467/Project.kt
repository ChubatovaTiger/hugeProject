package subProj_467

import subProj_467.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_467")
    name = "subProj 467"

    buildType(subProj_bt_467_2)
    buildType(subProj_bt_467_1)
    buildType(subProj_bt_467_0)
    buildType(subProj_bt_467_5)
    buildType(subProj_bt_467_4)
    buildType(subProj_bt_467_3)
})
