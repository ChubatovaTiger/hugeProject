package subProj_519

import subProj_519.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_519")
    name = "subProj 519"

    buildType(subProj_bt_519_5)
    buildType(subProj_bt_519_4)
    buildType(subProj_bt_519_3)
    buildType(subProj_bt_519_2)
    buildType(subProj_bt_519_1)
    buildType(subProj_bt_519_0)
})
