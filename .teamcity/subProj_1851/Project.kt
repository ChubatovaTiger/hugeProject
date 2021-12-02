package subProj_1851

import subProj_1851.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1851")
    name = "subProj 1851"

    buildType(subProj_bt_1851_4)
    buildType(subProj_bt_1851_3)
    buildType(subProj_bt_1851_5)
    buildType(subProj_bt_1851_0)
    buildType(subProj_bt_1851_2)
    buildType(subProj_bt_1851_1)
})
