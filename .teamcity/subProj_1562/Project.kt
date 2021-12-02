package subProj_1562

import subProj_1562.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1562")
    name = "subProj 1562"

    buildType(subProj_bt_1562_0)
    buildType(subProj_bt_1562_1)
    buildType(subProj_bt_1562_2)
    buildType(subProj_bt_1562_3)
    buildType(subProj_bt_1562_4)
    buildType(subProj_bt_1562_5)
})
