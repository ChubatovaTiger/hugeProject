package subProj_404

import subProj_404.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_404")
    name = "subProj 404"

    buildType(subProj_bt_404_0)
    buildType(subProj_bt_404_1)
    buildType(subProj_bt_404_2)
    buildType(subProj_bt_404_3)
    buildType(subProj_bt_404_4)
    buildType(subProj_bt_404_5)
})
