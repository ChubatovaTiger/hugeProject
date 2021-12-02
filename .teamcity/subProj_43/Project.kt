package subProj_43

import subProj_43.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_43")
    name = "subProj 43"

    buildType(subProj_bt_43_0)
    buildType(subProj_bt_43_2)
    buildType(subProj_bt_43_1)
    buildType(subProj_bt_43_4)
    buildType(subProj_bt_43_3)
    buildType(subProj_bt_43_5)
})
