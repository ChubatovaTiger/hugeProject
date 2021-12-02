package subProj_351

import subProj_351.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_351")
    name = "subProj 351"

    buildType(subProj_bt_351_5)
    buildType(subProj_bt_351_1)
    buildType(subProj_bt_351_2)
    buildType(subProj_bt_351_3)
    buildType(subProj_bt_351_4)
    buildType(subProj_bt_351_0)
})
