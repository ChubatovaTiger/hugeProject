package subProj_471

import subProj_471.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_471")
    name = "subProj 471"

    buildType(subProj_bt_471_1)
    buildType(subProj_bt_471_0)
    buildType(subProj_bt_471_5)
    buildType(subProj_bt_471_4)
    buildType(subProj_bt_471_3)
    buildType(subProj_bt_471_2)
})
