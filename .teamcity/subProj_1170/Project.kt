package subProj_1170

import subProj_1170.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_1170")
    name = "subProj 1170"

    buildType(subProj_bt_1170_0)
    buildType(subProj_bt_1170_5)
    buildType(subProj_bt_1170_1)
    buildType(subProj_bt_1170_2)
    buildType(subProj_bt_1170_3)
    buildType(subProj_bt_1170_4)
})
