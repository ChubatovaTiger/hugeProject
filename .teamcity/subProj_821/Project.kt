package subProj_821

import subProj_821.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("subProj_821")
    name = "subProj 821"

    buildType(subProj_bt_821_5)
    buildType(subProj_bt_821_0)
    buildType(subProj_bt_821_2)
    buildType(subProj_bt_821_1)
    buildType(subProj_bt_821_4)
    buildType(subProj_bt_821_3)
})
