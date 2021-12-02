package subProj_307

import subProj_307.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_307")
    name = "subProj 307"

    buildType(subProj_bt_307_0)
    buildType(subProj_bt_307_1)
    buildType(subProj_bt_307_4)
    buildType(subProj_bt_307_5)
    buildType(subProj_bt_307_2)
    buildType(subProj_bt_307_3)
})
