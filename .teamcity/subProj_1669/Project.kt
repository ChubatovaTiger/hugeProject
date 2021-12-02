package subProj_1669

import subProj_1669.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1669")
    name = "subProj 1669"

    buildType(subProj_bt_1669_4)
    buildType(subProj_bt_1669_5)
    buildType(subProj_bt_1669_2)
    buildType(subProj_bt_1669_3)
    buildType(subProj_bt_1669_0)
    buildType(subProj_bt_1669_1)
})
