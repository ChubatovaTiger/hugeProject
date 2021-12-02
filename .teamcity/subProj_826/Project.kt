package subProj_826

import subProj_826.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_826")
    name = "subProj 826"

    buildType(subProj_bt_826_1)
    buildType(subProj_bt_826_0)
    buildType(subProj_bt_826_3)
    buildType(subProj_bt_826_2)
    buildType(subProj_bt_826_5)
    buildType(subProj_bt_826_4)
})
