package subProj_1926

import subProj_1926.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1926")
    name = "subProj 1926"

    buildType(subProj_bt_1926_0)
    buildType(subProj_bt_1926_1)
    buildType(subProj_bt_1926_4)
    buildType(subProj_bt_1926_5)
    buildType(subProj_bt_1926_2)
    buildType(subProj_bt_1926_3)
})
