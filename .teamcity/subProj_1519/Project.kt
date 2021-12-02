package subProj_1519

import subProj_1519.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1519")
    name = "subProj 1519"

    buildType(subProj_bt_1519_1)
    buildType(subProj_bt_1519_0)
    buildType(subProj_bt_1519_3)
    buildType(subProj_bt_1519_2)
    buildType(subProj_bt_1519_5)
    buildType(subProj_bt_1519_4)
})
