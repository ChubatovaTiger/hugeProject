package subProj_1410

import subProj_1410.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1410")
    name = "subProj 1410"

    buildType(subProj_bt_1410_3)
    buildType(subProj_bt_1410_2)
    buildType(subProj_bt_1410_1)
    buildType(subProj_bt_1410_0)
    buildType(subProj_bt_1410_5)
    buildType(subProj_bt_1410_4)
})
