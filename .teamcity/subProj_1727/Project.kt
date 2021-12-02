package subProj_1727

import subProj_1727.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1727")
    name = "subProj 1727"

    buildType(subProj_bt_1727_5)
    buildType(subProj_bt_1727_3)
    buildType(subProj_bt_1727_4)
    buildType(subProj_bt_1727_1)
    buildType(subProj_bt_1727_2)
    buildType(subProj_bt_1727_0)
})
