package subProj_825

import subProj_825.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_825")
    name = "subProj 825"

    buildType(subProj_bt_825_2)
    buildType(subProj_bt_825_1)
    buildType(subProj_bt_825_4)
    buildType(subProj_bt_825_3)
    buildType(subProj_bt_825_5)
    buildType(subProj_bt_825_0)
})
