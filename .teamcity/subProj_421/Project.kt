package subProj_421

import subProj_421.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_421")
    name = "subProj 421"

    buildType(subProj_bt_421_2)
    buildType(subProj_bt_421_1)
    buildType(subProj_bt_421_4)
    buildType(subProj_bt_421_3)
    buildType(subProj_bt_421_5)
    buildType(subProj_bt_421_0)
})
