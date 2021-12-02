package subProj_1516

import subProj_1516.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1516")
    name = "subProj 1516"

    buildType(subProj_bt_1516_2)
    buildType(subProj_bt_1516_1)
    buildType(subProj_bt_1516_4)
    buildType(subProj_bt_1516_3)
    buildType(subProj_bt_1516_5)
    buildType(subProj_bt_1516_0)
})
