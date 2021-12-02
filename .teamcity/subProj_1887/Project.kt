package subProj_1887

import subProj_1887.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1887")
    name = "subProj 1887"

    buildType(subProj_bt_1887_3)
    buildType(subProj_bt_1887_2)
    buildType(subProj_bt_1887_1)
    buildType(subProj_bt_1887_0)
    buildType(subProj_bt_1887_5)
    buildType(subProj_bt_1887_4)
})
