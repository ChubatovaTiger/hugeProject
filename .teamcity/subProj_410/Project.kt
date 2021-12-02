package subProj_410

import subProj_410.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_410")
    name = "subProj 410"

    buildType(subProj_bt_410_1)
    buildType(subProj_bt_410_2)
    buildType(subProj_bt_410_3)
    buildType(subProj_bt_410_4)
    buildType(subProj_bt_410_5)
    buildType(subProj_bt_410_0)
})
