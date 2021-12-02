package subProj_992

import subProj_992.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_992")
    name = "subProj 992"

    buildType(subProj_bt_992_0)
    buildType(subProj_bt_992_1)
    buildType(subProj_bt_992_4)
    buildType(subProj_bt_992_5)
    buildType(subProj_bt_992_2)
    buildType(subProj_bt_992_3)
})
