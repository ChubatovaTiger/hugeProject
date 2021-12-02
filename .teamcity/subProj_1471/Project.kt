package subProj_1471

import subProj_1471.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1471")
    name = "subProj 1471"

    buildType(subProj_bt_1471_3)
    buildType(subProj_bt_1471_4)
    buildType(subProj_bt_1471_1)
    buildType(subProj_bt_1471_2)
    buildType(subProj_bt_1471_0)
    buildType(subProj_bt_1471_5)
})
