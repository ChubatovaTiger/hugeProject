package subProj_1565

import subProj_1565.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1565")
    name = "subProj 1565"

    buildType(subProj_bt_1565_3)
    buildType(subProj_bt_1565_4)
    buildType(subProj_bt_1565_5)
    buildType(subProj_bt_1565_0)
    buildType(subProj_bt_1565_1)
    buildType(subProj_bt_1565_2)
})
