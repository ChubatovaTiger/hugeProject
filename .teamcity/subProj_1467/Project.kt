package subProj_1467

import subProj_1467.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1467")
    name = "subProj 1467"

    buildType(subProj_bt_1467_4)
    buildType(subProj_bt_1467_5)
    buildType(subProj_bt_1467_2)
    buildType(subProj_bt_1467_3)
    buildType(subProj_bt_1467_0)
    buildType(subProj_bt_1467_1)
})
